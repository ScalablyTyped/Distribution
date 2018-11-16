package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nNs {
  /**
           * An ISO language code such as en or fr.
           * For a complete list of languages supported by this method, see kLanguageInfoTable.
           * For an unknown language, und will be returned,
           * which means that [percentage] of the text is unknown to CLD
           * @since Chrome 47.
           */
  type LanguageCode = kLanguageInfoTable | chromeDashAppsLib.chromeDashAppsLibStrings.und
  /** Allow array of strings with length 1 to 9 */
  type StringSubstitutions = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple3[java.lang.String, java.lang.String, java.lang.String]) | (js.Tuple4[java.lang.String, java.lang.String, java.lang.String, java.lang.String]) | (js.Tuple5[java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String]) | (js.Tuple6[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]) | (js.Tuple7[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]) | (js.Tuple8[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ]) | (js.Tuple9[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ])
  /**
           * @see[Source]{@link https://github.com/chromium/chromium/blob/master/ui/base/l10n/l10n_util.cc}
           */
  type kLanguageInfoTable = /* LimitUnionLength: was union type with length 169 */java.lang.String
}
