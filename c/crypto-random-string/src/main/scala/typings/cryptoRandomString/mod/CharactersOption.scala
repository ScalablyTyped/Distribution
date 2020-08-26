package typings.cryptoRandomString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharactersOption extends js.Object {
  /**
  	Use only characters from a custom set of allowed characters.
  	Cannot be set at the same time as the `type` option.
  	Minimum length: `1`
  	Maximum length: `65536`
  	@example
  	```
  	cryptoRandomString({length: 10, characters: '0123456789'});
  	//=> '8796225811'
  	```
  	*/
  var characters: js.UndefOr[String] = js.native
}

object CharactersOption {
  @scala.inline
  def apply(): CharactersOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharactersOption]
  }
  @scala.inline
  implicit class CharactersOptionOps[Self <: CharactersOption] (val x: Self) extends AnyVal {
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
    def setCharacters(value: String): Self = this.set("characters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacters: Self = this.set("characters", js.undefined)
  }
  
}

