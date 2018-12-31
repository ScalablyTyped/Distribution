package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /** {default:false}, return BSON regular expressions as BSONRegExp instances. */
  var bsonRegExp: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:false}, cache evaluated functions for reuse. */
  var cacheFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:false}, use a crc32 code for caching, otherwise use the string of the function. */
  var cacheFunctionsCrc32: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:false}, evaluate functions in the BSON document scoped to the object deserialized. */
  var evalFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:null}, allow to specify if there what fields we wish to return as unserialized raw buffer. */
  var fieldsAsRaw: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /** {default:false}, deserialize Binary data directly into node.js Buffer object. */
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:true}, when deserializing a Long will fit it into a Number if it's smaller than 53 bits. */
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  /** {default:false}, when deserializing will promote BSON values to their Node.js closest equivalent types. */
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
}

