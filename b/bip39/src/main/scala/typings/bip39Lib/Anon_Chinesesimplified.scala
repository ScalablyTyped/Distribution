package typings
package bip39Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chinesesimplified extends js.Object {
  var EN: js.Array[java.lang.String]
  var JA: js.Array[java.lang.String]
  var chinese_simplified: js.Array[java.lang.String]
  var chinese_traditional: js.Array[java.lang.String]
  var english: js.Array[java.lang.String]
  var french: js.Array[java.lang.String]
  var italian: js.Array[java.lang.String]
  var japanese: js.Array[java.lang.String]
  var spanish: js.Array[java.lang.String]
}

object Anon_Chinesesimplified {
  @scala.inline
  def apply(
    EN: js.Array[java.lang.String],
    JA: js.Array[java.lang.String],
    chinese_simplified: js.Array[java.lang.String],
    chinese_traditional: js.Array[java.lang.String],
    english: js.Array[java.lang.String],
    french: js.Array[java.lang.String],
    italian: js.Array[java.lang.String],
    japanese: js.Array[java.lang.String],
    spanish: js.Array[java.lang.String]
  ): Anon_Chinesesimplified = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EN")(EN)
    __obj.updateDynamic("JA")(JA)
    __obj.updateDynamic("chinese_simplified")(chinese_simplified)
    __obj.updateDynamic("chinese_traditional")(chinese_traditional)
    __obj.updateDynamic("english")(english)
    __obj.updateDynamic("french")(french)
    __obj.updateDynamic("italian")(italian)
    __obj.updateDynamic("japanese")(japanese)
    __obj.updateDynamic("spanish")(spanish)
    __obj.asInstanceOf[Anon_Chinesesimplified]
  }
}

