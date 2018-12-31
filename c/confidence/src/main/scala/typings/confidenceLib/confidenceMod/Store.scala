package typings
package confidenceLib.confidenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("confidence", "Store")
@js.native
/**
  * @constructor
  * @param {any} document - the configuration document for this document store
  */
class Store () extends js.Object {
  def this(document: js.Any) = this()
  /**
    * Retrieves a value from the configuration document after applying the provided criteria where:
    *   @param {string} key - the requested key path. All keys must begin with '/'. '/' returns the the entire document.
    *   @param {any} criteria - optional object used as criteria for applying filters in the configuration document. Defaults to {}.
    *
    *   @return {any} Returns the value found after applying the criteria. If the key is invalid or not found, returns undefined.
    */
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, criteria: js.Any): js.Any = js.native
  /**
    * Validates the provided configuration, clears any existing configuration, then loads the configuration where:
    *   @param {any} document - an object containing a confidence configuration object generated from a parsed JSON document. If the document is invlaid, will throw an error.
    */
  def load(document: js.Any): scala.Unit = js.native
  /**
    * Retrieves the metadata (if any) from the configuration document after applying the provided criteria where:
    *   @param {string} key - the requested key path. All keys must begin with '/'. '/' returns the the entire document.
    *   @param {any} criteria - optional object used as criteria for applying filters in the configuration document. Defaults to {}.
    *
    *   @return {any} Returns the metadata found after applying the criteria. If the key is invalid or not found, or if no metadata is available, returns undefined.
    */
  def meta(key: java.lang.String): js.Any = js.native
  def meta(key: java.lang.String, criteria: js.Any): js.Any = js.native
}

