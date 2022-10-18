package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyData extends StObject {
  
  /**
    * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or multiple (multi-directional).  UNI  The terminology resource has one source language (for example, the first column in a CSV file), and all of its other languages are target languages.   MULTI  Any language in the terminology resource can be the source language or a target language. A single multi-directional terminology resource can be used for jobs that translate different language pairs. For example, if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish and Spanish to English.   When you create a custom terminology resource without specifying the directionality, it behaves as uni-directional terminology, although this parameter will have a null value.
    */
  var Directionality: js.UndefOr[typings.awsSdk.clientsTranslateMod.Directionality] = js.undefined
  
  /**
    * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding themselves.
    */
  var File: TerminologyFile
  
  /**
    * The data format of the custom terminology.
    */
  var Format: TerminologyDataFormat
}
object TerminologyData {
  
  inline def apply(File: TerminologyFile, Format: TerminologyDataFormat): TerminologyData = {
    val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyData]
  }
  
  extension [Self <: TerminologyData](x: Self) {
    
    inline def setDirectionality(value: Directionality): Self = StObject.set(x, "Directionality", value.asInstanceOf[js.Any])
    
    inline def setDirectionalityUndefined: Self = StObject.set(x, "Directionality", js.undefined)
    
    inline def setFile(value: TerminologyFile): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: TerminologyDataFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
  }
}
