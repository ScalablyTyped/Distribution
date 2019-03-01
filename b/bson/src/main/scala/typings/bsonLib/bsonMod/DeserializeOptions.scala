package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /** {default:false}, allows the buffer to be larger than the parsed BSON object. */
  var allowObjectSmallerThanBufferSize: js.UndefOr[scala.Boolean] = js.undefined
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

object DeserializeOptions {
  @scala.inline
  def apply(
    allowObjectSmallerThanBufferSize: js.UndefOr[scala.Boolean] = js.undefined,
    bsonRegExp: js.UndefOr[scala.Boolean] = js.undefined,
    cacheFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    cacheFunctionsCrc32: js.UndefOr[scala.Boolean] = js.undefined,
    evalFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    fieldsAsRaw: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined,
    promoteLongs: js.UndefOr[scala.Boolean] = js.undefined,
    promoteValues: js.UndefOr[scala.Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowObjectSmallerThanBufferSize)) __obj.updateDynamic("allowObjectSmallerThanBufferSize")(allowObjectSmallerThanBufferSize)
    if (!js.isUndefined(bsonRegExp)) __obj.updateDynamic("bsonRegExp")(bsonRegExp)
    if (!js.isUndefined(cacheFunctions)) __obj.updateDynamic("cacheFunctions")(cacheFunctions)
    if (!js.isUndefined(cacheFunctionsCrc32)) __obj.updateDynamic("cacheFunctionsCrc32")(cacheFunctionsCrc32)
    if (!js.isUndefined(evalFunctions)) __obj.updateDynamic("evalFunctions")(evalFunctions)
    if (fieldsAsRaw != null) __obj.updateDynamic("fieldsAsRaw")(fieldsAsRaw)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    __obj.asInstanceOf[DeserializeOptions]
  }
}

