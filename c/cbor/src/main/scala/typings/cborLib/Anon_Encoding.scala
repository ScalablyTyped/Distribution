package typings
package cborLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var input: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var tags: js.UndefOr[
    org.scalablytyped.runtime.NumberDictionary[js.Function1[/* val */ js.Array[_], _]]
  ] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    input: nodeLib.Buffer | java.lang.String = null,
    tags: org.scalablytyped.runtime.NumberDictionary[js.Function1[/* val */ js.Array[_], _]] = null
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

