package typings.azureMsalCommon.mod

import typings.azureMsalCommon.iuriMod.IUri
import typings.azureMsalCommon.serverAuthorizationCodeResponseMod.ServerAuthorizationCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "UrlString")
@js.native
open class UrlString protected ()
  extends typings.azureMsalCommon.urlStringMod.UrlString {
  def this(url: String) = this()
}
/* static members */
object UrlString {
  
  @JSImport("@azure/msal-common", "UrlString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given a url and a query string return the url with provided query string appended
    * @param url
    * @param queryString
    */
  inline def appendQueryString(url: String, queryString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendQueryString")(url.asInstanceOf[js.Any], queryString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Ensure urls are lower case and end with a / character.
    * @param url
    */
  inline def canonicalizeUri(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalizeUri")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def constructAuthorityUriFromObject(urlObject: IUri): typings.azureMsalCommon.urlStringMod.UrlString = ^.asInstanceOf[js.Dynamic].applyDynamic("constructAuthorityUriFromObject")(urlObject.asInstanceOf[js.Any]).asInstanceOf[typings.azureMsalCommon.urlStringMod.UrlString]
  
  inline def getAbsoluteUrl(relativeUrl: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteUrl")(relativeUrl.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns URL hash as server auth code response object.
    */
  inline def getDeserializedHash(hash: String): ServerAuthorizationCodeResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeserializedHash")(hash.asInstanceOf[js.Any]).asInstanceOf[ServerAuthorizationCodeResponse]
  
  /**
    * Returns URL query string as server auth code response object.
    */
  inline def getDeserializedQueryString(query: String): ServerAuthorizationCodeResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeserializedQueryString")(query.asInstanceOf[js.Any]).asInstanceOf[ServerAuthorizationCodeResponse]
  
  inline def getDomainFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Check if the hash of the URL string contains known properties
    */
  inline def hashContainsKnownProperties(hash: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hashContainsKnownProperties")(hash.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Parses hash string from given string. Returns empty string if no hash symbol is found.
    * @param hashString
    */
  inline def parseHash(hashString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHash")(hashString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Parses query string from given string. Returns empty string if no query symbol is found.
    * @param queryString
    */
  inline def parseQueryString(queryString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns a url with the hash removed
    * @param url
    */
  inline def removeHashFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHashFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
