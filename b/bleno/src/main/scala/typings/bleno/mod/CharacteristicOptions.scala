package typings.bleno.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacteristicOptions extends js.Object {
  
  var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.native
  
  var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var onReadRequest: js.UndefOr[
    (js.Function2[
      /* offset */ Double, 
      /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]) | Null
  ] = js.native
  
  var onSubscribe: js.UndefOr[
    (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
  ] = js.native
  
  var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var onWriteRequest: js.UndefOr[
    (js.Function4[
      /* data */ Buffer, 
      /* offset */ Double, 
      /* withoutResponse */ Boolean, 
      /* callback */ js.Function1[/* result */ Double, Unit], 
      Unit
    ]) | Null
  ] = js.native
  
  var properties: js.UndefOr[js.Array[Property] | Null] = js.native
  
  var secure: js.UndefOr[js.Array[Property] | Null] = js.native
  
  var uuid: String = js.native
  
  var value: js.UndefOr[Buffer | Null] = js.native
}
object CharacteristicOptions {
  
  @scala.inline
  def apply(uuid: String): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicOptions]
  }
  
  @scala.inline
  implicit class CharacteristicOptionsOps[Self <: CharacteristicOptions] (val x: Self) extends AnyVal {
    
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorsVarargs(value: Descriptor*): Self = this.set("descriptors", js.Array(value :_*))
    
    @scala.inline
    def setDescriptors(value: js.Array[Descriptor]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptors: Self = this.set("descriptors", js.undefined)
    
    @scala.inline
    def setDescriptorsNull: Self = this.set("descriptors", null)
    
    @scala.inline
    def setOnIndicate(value: () => Unit): Self = this.set("onIndicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnIndicate: Self = this.set("onIndicate", js.undefined)
    
    @scala.inline
    def setOnIndicateNull: Self = this.set("onIndicate", null)
    
    @scala.inline
    def setOnNotify(value: () => Unit): Self = this.set("onNotify", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnNotify: Self = this.set("onNotify", js.undefined)
    
    @scala.inline
    def setOnNotifyNull: Self = this.set("onNotify", null)
    
    @scala.inline
    def setOnReadRequest(
      value: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Unit
    ): Self = this.set("onReadRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnReadRequest: Self = this.set("onReadRequest", js.undefined)
    
    @scala.inline
    def setOnReadRequestNull: Self = this.set("onReadRequest", null)
    
    @scala.inline
    def setOnSubscribe(value: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Unit): Self = this.set("onSubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSubscribe: Self = this.set("onSubscribe", js.undefined)
    
    @scala.inline
    def setOnSubscribeNull: Self = this.set("onSubscribe", null)
    
    @scala.inline
    def setOnUnsubscribe(value: () => Unit): Self = this.set("onUnsubscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnsubscribe: Self = this.set("onUnsubscribe", js.undefined)
    
    @scala.inline
    def setOnUnsubscribeNull: Self = this.set("onUnsubscribe", null)
    
    @scala.inline
    def setOnWriteRequest(
      value: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Unit
    ): Self = this.set("onWriteRequest", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnWriteRequest: Self = this.set("onWriteRequest", js.undefined)
    
    @scala.inline
    def setOnWriteRequestNull: Self = this.set("onWriteRequest", null)
    
    @scala.inline
    def setPropertiesVarargs(value: Property*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[Property]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setPropertiesNull: Self = this.set("properties", null)
    
    @scala.inline
    def setSecureVarargs(value: Property*): Self = this.set("secure", js.Array(value :_*))
    
    @scala.inline
    def setSecure(value: js.Array[Property]): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSecureNull: Self = this.set("secure", null)
    
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
