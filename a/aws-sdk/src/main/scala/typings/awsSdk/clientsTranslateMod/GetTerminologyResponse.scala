package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTerminologyResponse extends StObject {
  
  /**
    * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This file was created when Amazon Translate attempted to create a terminology resource. The location is returned as a presigned URL to that has a 30-minute expiration.
    */
  var AuxiliaryDataLocation: js.UndefOr[TerminologyDataLocation] = js.undefined
  
  /**
    * The Amazon S3 location of the most recent custom terminology input file that was successfully imported into Amazon Translate. The location is returned as a presigned URL that has a 30-minute expiration.  Amazon Translate doesn't scan all input files for the risk of CSV injection attacks.  CSV injection occurs when a .csv or .tsv file is altered so that a record contains malicious code. The record begins with a special character, such as =, +, -, or @. When the file is opened in a spreadsheet program, the program might interpret the record as a formula and run the code within it. Before you download an input file from Amazon S3, ensure that you recognize the file and trust its creator. 
    */
  var TerminologyDataLocation: js.UndefOr[typings.awsSdk.clientsTranslateMod.TerminologyDataLocation] = js.undefined
  
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.clientsTranslateMod.TerminologyProperties] = js.undefined
}
object GetTerminologyResponse {
  
  inline def apply(): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTerminologyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTerminologyResponse] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryDataLocation(value: TerminologyDataLocation): Self = StObject.set(x, "AuxiliaryDataLocation", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryDataLocationUndefined: Self = StObject.set(x, "AuxiliaryDataLocation", js.undefined)
    
    inline def setTerminologyDataLocation(value: TerminologyDataLocation): Self = StObject.set(x, "TerminologyDataLocation", value.asInstanceOf[js.Any])
    
    inline def setTerminologyDataLocationUndefined: Self = StObject.set(x, "TerminologyDataLocation", js.undefined)
    
    inline def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    inline def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
