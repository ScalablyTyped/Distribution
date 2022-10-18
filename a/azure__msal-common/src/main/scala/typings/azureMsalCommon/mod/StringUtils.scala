package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAccountDecodedAuthTokenMod.DecodedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "StringUtils")
@js.native
open class StringUtils ()
  extends typings.azureMsalCommon.distUtilsStringUtilsMod.StringUtils
/* static members */
object StringUtils {
  
  @JSImport("@azure/msal-common", "StringUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * decode a JWT
    *
    * @param authToken
    */
  inline def decodeAuthToken(authToken: String): DecodedAuthToken = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAuthToken")(authToken.asInstanceOf[js.Any]).asInstanceOf[DecodedAuthToken]
  
  inline def endsWith(str: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a string is empty.
    *
    * @param str
    */
  inline def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  inline def isEmpty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Check if stringified object is empty
    * @param strObj
    */
  inline def isEmptyObj(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObj")().asInstanceOf[Boolean]
  inline def isEmptyObj(strObj: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObj")(strObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Attempts to parse a string into JSON
    * @param str
    */
  inline def jsonParseHelper[T](str: String): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParseHelper")(str.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  /**
    * Tests if a given string matches a given pattern, with support for wildcards and queries.
    * @param pattern Wildcard pattern to string match. Supports "*" for wildcards and "?" for queries
    * @param input String to match against
    */
  inline def matchPattern(pattern: String, input: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPattern")(pattern.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Parses string into an object.
    *
    * @param query
    */
  inline def queryStringToObject[T](query: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("queryStringToObject")(query.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Removes empty strings from array
    * @param arr
    */
  inline def removeEmptyStringsFromArray(arr: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyStringsFromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def startsWith(str: String, search: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(str.asInstanceOf[js.Any], search.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Trims entries in an array.
    *
    * @param arr
    */
  inline def trimArrayEntries(arr: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimArrayEntries")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
