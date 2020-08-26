package typings.awsSdkClientKmsNode.typesGrantConstraintsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraints extends js.Object {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  var EncryptionContextEquals: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  var EncryptionContextSubset: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}

object GrantConstraints {
  @scala.inline
  def apply(): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraints]
  }
  @scala.inline
  implicit class GrantConstraintsOps[Self <: GrantConstraints] (val x: Self) extends AnyVal {
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
    def setEncryptionContextEquals(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("EncryptionContextEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionContextEquals: Self = this.set("EncryptionContextEquals", js.undefined)
    @scala.inline
    def setEncryptionContextSubset(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("EncryptionContextSubset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionContextSubset: Self = this.set("EncryptionContextSubset", js.undefined)
  }
  
}

