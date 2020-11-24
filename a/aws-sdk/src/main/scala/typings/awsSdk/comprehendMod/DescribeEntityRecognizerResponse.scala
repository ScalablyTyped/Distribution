package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntityRecognizerResponse extends js.Object {
  
  /**
    * Describes information associated with an entity recognizer.
    */
  var EntityRecognizerProperties: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerProperties] = js.native
}
object DescribeEntityRecognizerResponse {
  
  @scala.inline
  def apply(): DescribeEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityRecognizerResponse]
  }
  
  @scala.inline
  implicit class DescribeEntityRecognizerResponseOps[Self <: DescribeEntityRecognizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntityRecognizerProperties(value: EntityRecognizerProperties): Self = this.set("EntityRecognizerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityRecognizerProperties: Self = this.set("EntityRecognizerProperties", js.undefined)
  }
}
