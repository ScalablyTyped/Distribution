package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.awsSdkUtilEndpointsBooleans.`false`
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionReturn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var value: FunctionReturn
  }
  object Name {
    
    inline def apply(name: String, value: FunctionReturn): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: FunctionReturn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceRecord extends StObject {
    
    var referenceRecord: Unit
    
    var result: `false`
  }
  object ReferenceRecord {
    
    inline def apply(referenceRecord: Unit): ReferenceRecord = {
      val __obj = js.Dynamic.literal(referenceRecord = referenceRecord.asInstanceOf[js.Any], result = false)
      __obj.asInstanceOf[ReferenceRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceRecord] (val x: Self) extends AnyVal {
      
      inline def setReferenceRecord(value: Unit): Self = StObject.set(x, "referenceRecord", value.asInstanceOf[js.Any])
      
      inline def setResult(value: `false`): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceRecordResult extends StObject {
    
    var referenceRecord: Record[String, FunctionReturn]
    
    var result: Boolean
  }
  object ReferenceRecordResult {
    
    inline def apply(referenceRecord: Record[String, FunctionReturn], result: Boolean): ReferenceRecordResult = {
      val __obj = js.Dynamic.literal(referenceRecord = referenceRecord.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceRecordResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceRecordResult] (val x: Self) extends AnyVal {
      
      inline def setReferenceRecord(value: Record[String, FunctionReturn]): Self = StObject.set(x, "referenceRecord", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var result: Boolean
    
    var toAssign: js.UndefOr[Name] = js.undefined
  }
  object Result {
    
    inline def apply(result: Boolean): Result = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setToAssign(value: Name): Self = StObject.set(x, "toAssign", value.asInstanceOf[js.Any])
      
      inline def setToAssignUndefined: Self = StObject.set(x, "toAssign", js.undefined)
    }
  }
}
