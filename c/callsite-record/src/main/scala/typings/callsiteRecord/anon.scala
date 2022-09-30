package typings.callsiteRecord

import typings.callsiteRecord.mod.StackFrame
import typings.callsiteRecord.mod.isCallSiteFrame
import typings.chalk.mod.Chalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comment extends StObject {
    
    var comment: Chalk
    
    var invalid: Chalk
    
    var keyword: Chalk
    
    var number: Chalk
    
    var punctuator: Chalk
    
    var regex: Chalk
    
    var string: Chalk
  }
  object Comment {
    
    inline def apply(
      comment: Chalk,
      invalid: Chalk,
      keyword: Chalk,
      number: Chalk,
      punctuator: Chalk,
      regex: Chalk,
      string: Chalk
    ): Comment = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], punctuator = punctuator.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: Chalk): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Chalk): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: Chalk): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Chalk): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPunctuator(value: Chalk): Self = StObject.set(x, "punctuator", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Chalk): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setString(value: Chalk): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<callsite-record.callsite-record.CreateCallsiteRecordOptions, 'forError' | 'isCallsiteFrame' | 'processFrameFn'> */
  trait PickCreateCallsiteRecordO extends StObject {
    
    var forError: js.Error
    
    var isCallsiteFrame: js.UndefOr[isCallSiteFrame] = js.undefined
    
    var processFrameFn: js.UndefOr[typings.callsiteRecord.mod.processFrameFn] = js.undefined
  }
  object PickCreateCallsiteRecordO {
    
    inline def apply(forError: js.Error): PickCreateCallsiteRecordO = {
      val __obj = js.Dynamic.literal(forError = forError.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickCreateCallsiteRecordO]
    }
    
    extension [Self <: PickCreateCallsiteRecordO](x: Self) {
      
      inline def setForError(value: js.Error): Self = StObject.set(x, "forError", value.asInstanceOf[js.Any])
      
      inline def setIsCallsiteFrame(value: /* stackFrame */ StackFrame => Boolean): Self = StObject.set(x, "isCallsiteFrame", js.Any.fromFunction1(value))
      
      inline def setIsCallsiteFrameUndefined: Self = StObject.set(x, "isCallsiteFrame", js.undefined)
      
      inline def setProcessFrameFn(value: /* stackFrame */ StackFrame => StackFrame): Self = StObject.set(x, "processFrameFn", js.Any.fromFunction1(value))
      
      inline def setProcessFrameFnUndefined: Self = StObject.set(x, "processFrameFn", js.undefined)
    }
  }
  
  /* Inlined std.Pick<callsite-record.callsite-record.CreateCallsiteRecordOptions, 'byFunctionName' | 'typeName' | 'processFrameFn'> */
  trait PickCreateCallsiteRecordOByFunctionName extends StObject {
    
    var byFunctionName: String
    
    var processFrameFn: js.UndefOr[typings.callsiteRecord.mod.processFrameFn] = js.undefined
    
    var typeName: js.UndefOr[String] = js.undefined
  }
  object PickCreateCallsiteRecordOByFunctionName {
    
    inline def apply(byFunctionName: String): PickCreateCallsiteRecordOByFunctionName = {
      val __obj = js.Dynamic.literal(byFunctionName = byFunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickCreateCallsiteRecordOByFunctionName]
    }
    
    extension [Self <: PickCreateCallsiteRecordOByFunctionName](x: Self) {
      
      inline def setByFunctionName(value: String): Self = StObject.set(x, "byFunctionName", value.asInstanceOf[js.Any])
      
      inline def setProcessFrameFn(value: /* stackFrame */ StackFrame => StackFrame): Self = StObject.set(x, "processFrameFn", js.Any.fromFunction1(value))
      
      inline def setProcessFrameFnUndefined: Self = StObject.set(x, "processFrameFn", js.undefined)
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    }
  }
}
