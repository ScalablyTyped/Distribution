package typings.bson.bsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /** {default:false}, allows the buffer to be larger than the parsed BSON object. */
  var allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, return BSON regular expressions as BSONRegExp instances. */
  var bsonRegExp: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, cache evaluated functions for reuse. */
  var cacheFunctions: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, use a crc32 code for caching, otherwise use the string of the function. */
  var cacheFunctionsCrc32: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, evaluate functions in the BSON document scoped to the object deserialized. */
  var evalFunctions: js.UndefOr[Boolean] = js.undefined
  /** {default:null}, allow to specify if there what fields we wish to return as unserialized raw buffer. */
  var fieldsAsRaw: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  /** {default:false}, deserialize Binary data directly into node.js Buffer object. */
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  /** {default:true}, when deserializing a Long will fit it into a Number if it's smaller than 53 bits. */
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, when deserializing will promote BSON values to their Node.js closest equivalent types. */
  var promoteValues: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.undefined,
    bsonRegExp: js.UndefOr[Boolean] = js.undefined,
    cacheFunctions: js.UndefOr[Boolean] = js.undefined,
    cacheFunctionsCrc32: js.UndefOr[Boolean] = js.undefined,
    evalFunctions: js.UndefOr[Boolean] = js.undefined,
    fieldsAsRaw: StringDictionary[Boolean] = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowObjectSmallerThanBufferSize)) __obj.updateDynamic("allowObjectSmallerThanBufferSize")(allowObjectSmallerThanBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(bsonRegExp)) __obj.updateDynamic("bsonRegExp")(bsonRegExp.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheFunctions)) __obj.updateDynamic("cacheFunctions")(cacheFunctions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheFunctionsCrc32)) __obj.updateDynamic("cacheFunctionsCrc32")(cacheFunctionsCrc32.asInstanceOf[js.Any])
    if (!js.isUndefined(evalFunctions)) __obj.updateDynamic("evalFunctions")(evalFunctions.asInstanceOf[js.Any])
    if (fieldsAsRaw != null) __obj.updateDynamic("fieldsAsRaw")(fieldsAsRaw.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

