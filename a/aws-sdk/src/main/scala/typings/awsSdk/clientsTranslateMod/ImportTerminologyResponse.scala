package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTerminologyResponse extends StObject {
  
  /**
    * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a presigned URL to that has a 30 minute expiration.
    */
  var AuxiliaryDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined
  
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.clientsTranslateMod.TerminologyProperties] = js.undefined
}
object ImportTerminologyResponse {
  
  inline def apply(): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTerminologyResponse] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryDataLocation(value: TerminologyDataLocation): Self = StObject.set(x, "AuxiliaryDataLocation", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryDataLocationUndefined: Self = StObject.set(x, "AuxiliaryDataLocation", js.undefined)
    
    inline def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    inline def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
