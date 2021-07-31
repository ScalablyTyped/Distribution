package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3OutputUrl extends StObject {
  
  /**
    * A URL for an S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[Url] = js.undefined
}
object S3OutputUrl {
  
  @scala.inline
  def apply(): S3OutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputUrl]
  }
  
  @scala.inline
  implicit class S3OutputUrlMutableBuilder[Self <: S3OutputUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputUrl(value: Url): Self = StObject.set(x, "OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlUndefined: Self = StObject.set(x, "OutputUrl", js.undefined)
  }
}
