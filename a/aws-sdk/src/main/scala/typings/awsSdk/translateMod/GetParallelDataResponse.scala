package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParallelDataResponse extends StObject {
  
  /**
    * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This file was created when Amazon Translate attempted to create a parallel data resource. The location is returned as a presigned URL to that has a 30-minute expiration.
    */
  var AuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined
  
  /**
    * The Amazon S3 location of the most recent parallel data input file that was successfully imported into Amazon Translate. The location is returned as a presigned URL that has a 30-minute expiration.  Amazon Translate doesn't scan all input files for the risk of CSV injection attacks.  CSV injection occurs when a .csv or .tsv file is altered so that a record contains malicious code. The record begins with a special character, such as =, +, -, or @. When the file is opened in a spreadsheet program, the program might interpret the record as a formula and run the code within it. Before you download an input file from Amazon S3, ensure that you recognize the file and trust its creator. 
    */
  var DataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined
  
  /**
    * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This file was created when Amazon Translate attempted to update a parallel data resource. The location is returned as a presigned URL to that has a 30-minute expiration.
    */
  var LatestUpdateAttemptAuxiliaryDataLocation: js.UndefOr[ParallelDataDataLocation] = js.undefined
  
  /**
    * The properties of the parallel data resource that is being retrieved.
    */
  var ParallelDataProperties: js.UndefOr[typings.awsSdk.translateMod.ParallelDataProperties] = js.undefined
}
object GetParallelDataResponse {
  
  inline def apply(): GetParallelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParallelDataResponse]
  }
  
  extension [Self <: GetParallelDataResponse](x: Self) {
    
    inline def setAuxiliaryDataLocation(value: ParallelDataDataLocation): Self = StObject.set(x, "AuxiliaryDataLocation", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryDataLocationUndefined: Self = StObject.set(x, "AuxiliaryDataLocation", js.undefined)
    
    inline def setDataLocation(value: ParallelDataDataLocation): Self = StObject.set(x, "DataLocation", value.asInstanceOf[js.Any])
    
    inline def setDataLocationUndefined: Self = StObject.set(x, "DataLocation", js.undefined)
    
    inline def setLatestUpdateAttemptAuxiliaryDataLocation(value: ParallelDataDataLocation): Self = StObject.set(x, "LatestUpdateAttemptAuxiliaryDataLocation", value.asInstanceOf[js.Any])
    
    inline def setLatestUpdateAttemptAuxiliaryDataLocationUndefined: Self = StObject.set(x, "LatestUpdateAttemptAuxiliaryDataLocation", js.undefined)
    
    inline def setParallelDataProperties(value: ParallelDataProperties): Self = StObject.set(x, "ParallelDataProperties", value.asInstanceOf[js.Any])
    
    inline def setParallelDataPropertiesUndefined: Self = StObject.set(x, "ParallelDataProperties", js.undefined)
  }
}
