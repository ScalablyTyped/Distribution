package typings
package countryDashListLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_GetCodes extends js.Object {
  /**
     * Expects the English country name. Returns the code for that country. If not found, it returns undefined.
     */
  def getCode(name: java.lang.String): js.UndefOr[java.lang.String]
  /**
     * Returns a key-value object of all countries using the code as key.
     */
  def getCodeList(): ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
     * Returns an array of all country codes.
     */
  def getCodes(): js.Array[java.lang.String]
  /**
     * Returns an array of all country information, in the same format as it gets imported.
     */
  def getData(): js.Array[Anon_Code]
  /**
     * Expects a two-digit country code. Returns the name for that country. If not found, it returns undefined.
     */
  def getName(code: java.lang.String): js.UndefOr[java.lang.String]
  /**
     * Returns a key-value object of all countries using the name as key.
     */
  def getNameList(): ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
     * Returns an array of all country names.
     */
  def getNames(): js.Array[java.lang.String]
}

