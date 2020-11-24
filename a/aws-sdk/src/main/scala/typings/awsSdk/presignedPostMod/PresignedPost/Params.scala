package typings.awsSdk.presignedPostMod.PresignedPost

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends js.Object {
  
  /**
    * The S3 bucket to which the form should upload an attached file.
    */
  var Bucket: js.UndefOr[String] = js.native
  
  /**
    * An array of conditions that must be met for the form upload to be
    * accepted by S3.
    */
  var Conditions: js.UndefOr[js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])]] = js.native
  
  /**
    * The number of seconds for which the POST form's signed policy should be
    * valid. Defaults to 3600 (one hour).
    */
  var Expires: js.UndefOr[Double] = js.native
  
  /**
    * A hash of form fields to include in the presigned POST form. All fields
    * (except 'key') will be included as exact match conditions in the
    * presigned policy.
    */
  var Fields: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: (StringDictionary[js.Any] | (js.Tuple3[String, js.Any, js.Any]))*): Self = this.set("Conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[StringDictionary[_] | (js.Tuple3[String, _, _])]): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("Conditions", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[js.Any]): Self = this.set("Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
  }
}
