package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePaths extends StObject {
  
  /**
    * The name of the infected or suspicious file corresponding to the hash. 
    */
  var FileName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Path to the infected or suspicious file on the resource it was detected on. 
    */
  var FilePath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The hash value for the infected or suspicious file. 
    */
  var Hash: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource on which the threat was detected. 
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
}
object FilePaths {
  
  inline def apply(): FilePaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePaths]
  }
  
  extension [Self <: FilePaths](x: Self) {
    
    inline def setFileName(value: NonEmptyString): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "FileName", js.undefined)
    
    inline def setFilePath(value: NonEmptyString): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "FilePath", js.undefined)
    
    inline def setHash(value: NonEmptyString): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
