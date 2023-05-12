package typings.azureCoreHttpCompat.mod

import typings.azureCoreHttpCompat.anon.PreserveCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHeadersLike extends StObject {
  
  /**
    * Get whether or not this header collection contains a header entry for the provided header name.
    */
  def contains(headerName: String): Boolean = js.native
  
  /**
    * Get the header value for the provided header name, or undefined if no header exists in this
    * collection with the provided name.
    * @param headerName - The name of the header.
    */
  def get(headerName: String): js.UndefOr[String] = js.native
  
  /**
    * Get the header names that are contained in this collection.
    */
  def headerNames(): js.Array[String] = js.native
  
  /**
    * Get the header values that are contained in this collection.
    */
  def headerValues(): js.Array[String] = js.native
  
  /**
    * Get the headers that are contained in this collection as an array.
    */
  def headersArray(): js.Array[HttpHeader] = js.native
  
  /**
    * Get the headers that are contained this collection as an object.
    */
  def rawHeaders(): RawHttpHeaders = js.native
  
  /**
    * Remove the header with the provided headerName. Return whether or not the header existed and
    * was removed.
    * @param headerName - The name of the header to remove.
    */
  def remove(headerName: String): Boolean = js.native
  
  /**
    * Set a header in this collection with the provided name and value. The name is
    * case-insensitive.
    * @param headerName - The name of the header to set. This value is case-insensitive.
    * @param headerValue - The value of the header to set.
    */
  def set(headerName: String, headerValue: String): Unit = js.native
  def set(headerName: String, headerValue: Double): Unit = js.native
  
  /**
    * Get the JSON object representation of this HTTP header collection.
    * The result is the same as `rawHeaders()`.
    */
  def toJson(): RawHttpHeaders = js.native
  def toJson(options: PreserveCase): RawHttpHeaders = js.native
}
