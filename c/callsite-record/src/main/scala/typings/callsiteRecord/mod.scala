package typings.callsiteRecord

import typings.callsiteRecord.anon.PickCreateCallsiteRecordO
import typings.callsiteRecord.anon.PickCreateCallsiteRecordOByFunctionName
import typings.callsiteRecord.renderersMod.Renderer
import typings.callsiteRecord.renderersMod.Renderers
import typings.stackframe.mod.StackFrameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: PickCreateCallsiteRecordO): CallsiteRecord | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CallsiteRecord | Null]
  inline def apply(options: PickCreateCallsiteRecordOByFunctionName): CallsiteRecord | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CallsiteRecord | Null]
  
  @JSImport("callsite-record", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("callsite-record", "CallsiteRecord")
  @js.native
  open class CallsiteRecord () extends StObject {
    
    def render(options: RenderOptions): js.Promise[String] = js.native
    
    def renderSync(options: RenderOptions): String = js.native
  }
  object CallsiteRecord {
    
    @JSImport("callsite-record", "CallsiteRecord")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromError(error: js.Error, isCallsiteFrame: isCallSiteFrame, processFrameFn: processFrameFn): CallsiteRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any], isCallsiteFrame.asInstanceOf[js.Any], processFrameFn.asInstanceOf[js.Any])).asInstanceOf[CallsiteRecord | Null]
    
    /* static member */
    inline def fromStackFrames(
      stackFrames: js.Array[StackFrame],
      fnName: String,
      typeName: String,
      processFrameFn: processFrameFn
    ): CallsiteRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStackFrames")(stackFrames.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], processFrameFn.asInstanceOf[js.Any])).asInstanceOf[CallsiteRecord | Null]
  }
  
  @JSImport("callsite-record", "renderers")
  @js.native
  val renderers: Renderers = js.native
  
  trait CreateCallsiteRecordOptions extends StObject {
    
    var byFunctionName: String
    
    var forError: js.Error
    
    var isCallsiteFrame: js.UndefOr[isCallSiteFrame] = js.undefined
    
    var processFrameFn: js.UndefOr[typings.callsiteRecord.mod.processFrameFn] = js.undefined
    
    var typeName: js.UndefOr[String] = js.undefined
  }
  object CreateCallsiteRecordOptions {
    
    inline def apply(byFunctionName: String, forError: js.Error): CreateCallsiteRecordOptions = {
      val __obj = js.Dynamic.literal(byFunctionName = byFunctionName.asInstanceOf[js.Any], forError = forError.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCallsiteRecordOptions]
    }
    
    extension [Self <: CreateCallsiteRecordOptions](x: Self) {
      
      inline def setByFunctionName(value: String): Self = StObject.set(x, "byFunctionName", value.asInstanceOf[js.Any])
      
      inline def setForError(value: js.Error): Self = StObject.set(x, "forError", value.asInstanceOf[js.Any])
      
      inline def setIsCallsiteFrame(value: /* stackFrame */ StackFrame => Boolean): Self = StObject.set(x, "isCallsiteFrame", js.Any.fromFunction1(value))
      
      inline def setIsCallsiteFrameUndefined: Self = StObject.set(x, "isCallsiteFrame", js.undefined)
      
      inline def setProcessFrameFn(value: /* stackFrame */ StackFrame => StackFrame): Self = StObject.set(x, "processFrameFn", js.Any.fromFunction1(value))
      
      inline def setProcessFrameFnUndefined: Self = StObject.set(x, "processFrameFn", js.undefined)
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    }
  }
  
  trait RenderOptions extends StObject {
    
    var codeFrame: js.UndefOr[Boolean] = js.undefined
    
    var frameSize: js.UndefOr[Double] = js.undefined
    
    var renderer: js.UndefOr[Renderer] = js.undefined
    
    var stack: js.UndefOr[Boolean] = js.undefined
    
    var stackFilter: js.UndefOr[typings.callsiteRecord.mod.stackFilter] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setCodeFrame(value: Boolean): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setCodeFrameUndefined: Self = StObject.set(x, "codeFrame", js.undefined)
      
      inline def setFrameSize(value: Double): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackFilter(value: (/* stackFrame */ StackFrame, /* idx */ Double, /* isV8StackFrame */ Boolean) => Boolean): Self = StObject.set(x, "stackFilter", js.Any.fromFunction3(value))
      
      inline def setStackFilterUndefined: Self = StObject.set(x, "stackFilter", js.undefined)
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type StackFrame = StackFrameOptions
  
  type isCallSiteFrame = js.Function1[/* stackFrame */ StackFrame, Boolean]
  
  type processFrameFn = js.Function1[/* stackFrame */ StackFrame, StackFrame]
  
  type stackFilter = js.Function3[/* stackFrame */ StackFrame, /* idx */ Double, /* isV8StackFrame */ Boolean, Boolean]
}
