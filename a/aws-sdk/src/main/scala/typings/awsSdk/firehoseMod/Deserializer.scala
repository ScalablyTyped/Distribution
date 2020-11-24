package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deserializer extends js.Object {
  
  /**
    * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
    */
  var HiveJsonSerDe: js.UndefOr[typings.awsSdk.firehoseMod.HiveJsonSerDe] = js.native
  
  /**
    * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
    */
  var OpenXJsonSerDe: js.UndefOr[typings.awsSdk.firehoseMod.OpenXJsonSerDe] = js.native
}
object Deserializer {
  
  @scala.inline
  def apply(): Deserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deserializer]
  }
  
  @scala.inline
  implicit class DeserializerOps[Self <: Deserializer] (val x: Self) extends AnyVal {
    
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
    def setHiveJsonSerDe(value: HiveJsonSerDe): Self = this.set("HiveJsonSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiveJsonSerDe: Self = this.set("HiveJsonSerDe", js.undefined)
    
    @scala.inline
    def setOpenXJsonSerDe(value: OpenXJsonSerDe): Self = this.set("OpenXJsonSerDe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenXJsonSerDe: Self = this.set("OpenXJsonSerDe", js.undefined)
  }
}
