package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.awsSdkUtilEndpointsBooleans.`false`
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.FunctionReturn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
  }
  object Description {
    
    inline def apply(): Description = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait DnsSuffix extends StObject {
    
    var dnsSuffix: String
    
    var dualStackDnsSuffix: String
    
    var name: String
    
    var supportsDualStack: Boolean
    
    var supportsFIPS: Boolean
  }
  object DnsSuffix {
    
    inline def apply(
      dnsSuffix: String,
      dualStackDnsSuffix: String,
      name: String,
      supportsDualStack: Boolean,
      supportsFIPS: Boolean
    ): DnsSuffix = {
      val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], dualStackDnsSuffix = dualStackDnsSuffix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsDualStack = supportsDualStack.asInstanceOf[js.Any], supportsFIPS = supportsFIPS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsSuffix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsSuffix] (val x: Self) extends AnyVal {
      
      inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
      
      inline def setDualStackDnsSuffix(value: String): Self = StObject.set(x, "dualStackDnsSuffix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSupportsDualStack(value: Boolean): Self = StObject.set(x, "supportsDualStack", value.asInstanceOf[js.Any])
      
      inline def setSupportsFIPS(value: Boolean): Self = StObject.set(x, "supportsFIPS", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var outputs: DnsSuffix
    
    var regionRegex: String
    
    var regions: Record[String, js.UndefOr[Description]]
  }
  object Id {
    
    inline def apply(
      id: String,
      outputs: DnsSuffix,
      regionRegex: String,
      regions: Record[String, js.UndefOr[Description]]
    ): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], regionRegex = regionRegex.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: DnsSuffix): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setRegionRegex(value: String): Self = StObject.set(x, "regionRegex", value.asInstanceOf[js.Any])
      
      inline def setRegions(value: Record[String, js.UndefOr[Description]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    }
  }
  
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
