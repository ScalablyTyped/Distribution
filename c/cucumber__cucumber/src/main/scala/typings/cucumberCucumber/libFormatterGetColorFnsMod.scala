package typings.cucumberCucumber

import typings.cucumberMessages.distCjsSrcMessagesMod.TestStepResultStatus
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterGetColorFnsMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/get_color_fns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(stream: Writable, env: ProcessEnv): IColorFns = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[IColorFns]
  inline def default(stream: Writable, env: ProcessEnv, enabled: Boolean): IColorFns = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stream.asInstanceOf[js.Any], env.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[IColorFns]
  
  type IColorFn = js.Function1[/* text */ String, String]
  
  trait IColorFns extends StObject {
    
    def diffAdded(text: String): String
    @JSName("diffAdded")
    var diffAdded_Original: IColorFn
    
    def diffRemoved(text: String): String
    @JSName("diffRemoved")
    var diffRemoved_Original: IColorFn
    
    def errorMessage(text: String): String
    @JSName("errorMessage")
    var errorMessage_Original: IColorFn
    
    def errorStack(text: String): String
    @JSName("errorStack")
    var errorStack_Original: IColorFn
    
    def forStatus(status: TestStepResultStatus): IColorFn
    
    def location(text: String): String
    @JSName("location")
    var location_Original: IColorFn
    
    def tag(text: String): String
    @JSName("tag")
    var tag_Original: IColorFn
  }
  object IColorFns {
    
    inline def apply(
      diffAdded: /* text */ String => String,
      diffRemoved: /* text */ String => String,
      errorMessage: /* text */ String => String,
      errorStack: /* text */ String => String,
      forStatus: TestStepResultStatus => IColorFn,
      location: /* text */ String => String,
      tag: /* text */ String => String
    ): IColorFns = {
      val __obj = js.Dynamic.literal(diffAdded = js.Any.fromFunction1(diffAdded), diffRemoved = js.Any.fromFunction1(diffRemoved), errorMessage = js.Any.fromFunction1(errorMessage), errorStack = js.Any.fromFunction1(errorStack), forStatus = js.Any.fromFunction1(forStatus), location = js.Any.fromFunction1(location), tag = js.Any.fromFunction1(tag))
      __obj.asInstanceOf[IColorFns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColorFns] (val x: Self) extends AnyVal {
      
      inline def setDiffAdded(value: /* text */ String => String): Self = StObject.set(x, "diffAdded", js.Any.fromFunction1(value))
      
      inline def setDiffRemoved(value: /* text */ String => String): Self = StObject.set(x, "diffRemoved", js.Any.fromFunction1(value))
      
      inline def setErrorMessage(value: /* text */ String => String): Self = StObject.set(x, "errorMessage", js.Any.fromFunction1(value))
      
      inline def setErrorStack(value: /* text */ String => String): Self = StObject.set(x, "errorStack", js.Any.fromFunction1(value))
      
      inline def setForStatus(value: TestStepResultStatus => IColorFn): Self = StObject.set(x, "forStatus", js.Any.fromFunction1(value))
      
      inline def setLocation(value: /* text */ String => String): Self = StObject.set(x, "location", js.Any.fromFunction1(value))
      
      inline def setTag(value: /* text */ String => String): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    }
  }
}
