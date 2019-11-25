package typings.cbor

import org.scalablytyped.runtime.NumberDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[Buffer | String] = js.undefined
  var tags: js.UndefOr[NumberDictionary[js.Function1[/* val */ js.Array[_], _]]] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: String = null,
    input: Buffer | String = null,
    tags: NumberDictionary[js.Function1[/* val */ js.Array[_], _]] = null
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

