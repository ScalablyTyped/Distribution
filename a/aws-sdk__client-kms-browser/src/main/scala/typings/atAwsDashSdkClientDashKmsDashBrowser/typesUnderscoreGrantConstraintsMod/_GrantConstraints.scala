package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreGrantConstraintsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GrantConstraints extends js.Object {
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  var EncryptionContextEquals: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
    */
  var EncryptionContextSubset: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
}

object _GrantConstraints {
  @scala.inline
  def apply(
    EncryptionContextEquals: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    EncryptionContextSubset: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null
  ): _GrantConstraints = {
    val __obj = js.Dynamic.literal()
    if (EncryptionContextEquals != null) __obj.updateDynamic("EncryptionContextEquals")(EncryptionContextEquals.asInstanceOf[js.Any])
    if (EncryptionContextSubset != null) __obj.updateDynamic("EncryptionContextSubset")(EncryptionContextSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GrantConstraints]
  }
}

