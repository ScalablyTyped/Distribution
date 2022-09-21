package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3TableOutputOptions extends StObject {
  
  /**
    * Represents an Amazon S3 location (bucket name and object key) where DataBrew can write output from a job.
    */
  var Location: S3Location
}
object S3TableOutputOptions {
  
  inline def apply(Location: S3Location): S3TableOutputOptions = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3TableOutputOptions]
  }
  
  extension [Self <: S3TableOutputOptions](x: Self) {
    
    inline def setLocation(value: S3Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
