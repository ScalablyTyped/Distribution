package typings.bson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeserializeOptions extends js.Object {
  /** {default:false}, allows the buffer to be larger than the parsed BSON object. */
  var allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.native
  /** {default:false}, return BSON regular expressions as BSONRegExp instances. */
  var bsonRegExp: js.UndefOr[Boolean] = js.native
  /** {default:false}, cache evaluated functions for reuse. */
  var cacheFunctions: js.UndefOr[Boolean] = js.native
  /** {default:false}, use a crc32 code for caching, otherwise use the string of the function. */
  var cacheFunctionsCrc32: js.UndefOr[Boolean] = js.native
  /** {default:false}, evaluate functions in the BSON document scoped to the object deserialized. */
  var evalFunctions: js.UndefOr[Boolean] = js.native
  /** {default:null}, allow to specify if there what fields we wish to return as unserialized raw buffer. */
  var fieldsAsRaw: js.UndefOr[StringDictionary[Boolean]] = js.native
  /** {default:false}, deserialize Binary data directly into node.js Buffer object. */
  var promoteBuffers: js.UndefOr[Boolean] = js.native
  /** {default:true}, when deserializing a Long will fit it into a Number if it's smaller than 53 bits. */
  var promoteLongs: js.UndefOr[Boolean] = js.native
  /** {default:false}, when deserializing will promote BSON values to their Node.js closest equivalent types. */
  var promoteValues: js.UndefOr[Boolean] = js.native
}

object DeserializeOptions {
  @scala.inline
  def apply(): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  implicit class DeserializeOptionsOps[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowObjectSmallerThanBufferSize(value: Boolean): Self = this.set("allowObjectSmallerThanBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowObjectSmallerThanBufferSize: Self = this.set("allowObjectSmallerThanBufferSize", js.undefined)
    @scala.inline
    def setBsonRegExp(value: Boolean): Self = this.set("bsonRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsonRegExp: Self = this.set("bsonRegExp", js.undefined)
    @scala.inline
    def setCacheFunctions(value: Boolean): Self = this.set("cacheFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheFunctions: Self = this.set("cacheFunctions", js.undefined)
    @scala.inline
    def setCacheFunctionsCrc32(value: Boolean): Self = this.set("cacheFunctionsCrc32", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheFunctionsCrc32: Self = this.set("cacheFunctionsCrc32", js.undefined)
    @scala.inline
    def setEvalFunctions(value: Boolean): Self = this.set("evalFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalFunctions: Self = this.set("evalFunctions", js.undefined)
    @scala.inline
    def setFieldsAsRaw(value: StringDictionary[Boolean]): Self = this.set("fieldsAsRaw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldsAsRaw: Self = this.set("fieldsAsRaw", js.undefined)
    @scala.inline
    def setPromoteBuffers(value: Boolean): Self = this.set("promoteBuffers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteBuffers: Self = this.set("promoteBuffers", js.undefined)
    @scala.inline
    def setPromoteLongs(value: Boolean): Self = this.set("promoteLongs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteLongs: Self = this.set("promoteLongs", js.undefined)
    @scala.inline
    def setPromoteValues(value: Boolean): Self = this.set("promoteValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromoteValues: Self = this.set("promoteValues", js.undefined)
  }
  
}

