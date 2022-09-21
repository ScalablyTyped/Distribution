package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformFilterCriteria extends StObject {
  
  /**
    * The time and date after which the transforms were created.
    */
  var CreatedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time and date before which the transforms were created.
    */
  var CreatedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This value determines which version of Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  
  /**
    * Filter on transforms last modified after this date.
    */
  var LastModifiedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter on transforms last modified before this date.
    */
  var LastModifiedBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique transform name that is used to filter the machine learning transforms.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * Filters on datasets with a specific schema. The Map&lt;Column, Type&gt; object is an array of key-value pairs representing the schema this transform accepts, where Column is the name of a column, and Type is the type of the data such as an integer or string. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.undefined
  
  /**
    * Filters the list of machine learning transforms by the last known status of the transforms (to indicate whether a transform can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.undefined
  
  /**
    * The type of machine learning transform that is used to filter the machine learning transforms.
    */
  var TransformType: js.UndefOr[typings.awsSdk.glueMod.TransformType] = js.undefined
}
object TransformFilterCriteria {
  
  inline def apply(): TransformFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformFilterCriteria]
  }
  
  extension [Self <: TransformFilterCriteria](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "CreatedAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "CreatedAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "CreatedBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "CreatedBefore", js.undefined)
    
    inline def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    inline def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    inline def setLastModifiedAfter(value: js.Date): Self = StObject.set(x, "LastModifiedAfter", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAfterUndefined: Self = StObject.set(x, "LastModifiedAfter", js.undefined)
    
    inline def setLastModifiedBefore(value: js.Date): Self = StObject.set(x, "LastModifiedBefore", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBeforeUndefined: Self = StObject.set(x, "LastModifiedBefore", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSchema(value: TransformSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setSchemaVarargs(value: SchemaColumn*): Self = StObject.set(x, "Schema", js.Array(value*))
    
    inline def setStatus(value: TransformStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTransformType(value: TransformType): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
    
    inline def setTransformTypeUndefined: Self = StObject.set(x, "TransformType", js.undefined)
  }
}
