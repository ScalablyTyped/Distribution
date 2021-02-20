package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tagging extends StObject {
  
  /**
    * A collection for a set of tags.
    */
  var TagSet: S3TagSet = js.native
}
object Tagging {
  
  @scala.inline
  def apply(TagSet: S3TagSet): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
  
  @scala.inline
  implicit class TaggingMutableBuilder[Self <: Tagging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagSet(value: S3TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSetVarargs(value: S3Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
  }
}
