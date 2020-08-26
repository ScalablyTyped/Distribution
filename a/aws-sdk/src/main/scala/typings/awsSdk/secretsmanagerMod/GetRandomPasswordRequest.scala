package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRandomPasswordRequest extends js.Object {
  /**
    * A string that includes characters that should not be included in the generated password. The default is that all characters from the included sets can be used.
    */
  var ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.native
  /**
    * Specifies that the generated password should not include lowercase letters. The default if you do not include this switch parameter is that lowercase letters can be included.
    */
  var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.native
  /**
    * Specifies that the generated password should not include digits. The default if you do not include this switch parameter is that digits can be included.
    */
  var ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.native
  /**
    * Specifies that the generated password should not include punctuation characters. The default if you do not include this switch parameter is that punctuation characters can be included. The following are the punctuation characters that can be included in the generated password if you don't explicitly exclude them with ExcludeCharacters or ExcludePunctuation:  ! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~ 
    */
  var ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.native
  /**
    * Specifies that the generated password should not include uppercase letters. The default if you do not include this switch parameter is that uppercase letters can be included.
    */
  var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.native
  /**
    * Specifies that the generated password can include the space character. The default if you do not include this switch parameter is that the space character is not included.
    */
  var IncludeSpace: js.UndefOr[IncludeSpaceType] = js.native
  /**
    * The desired length of the generated password. The default value if you do not include this parameter is 32 characters.
    */
  var PasswordLength: js.UndefOr[PasswordLengthType] = js.native
  /**
    * A boolean value that specifies whether the generated password must include at least one of every allowed character type. The default value is True and the operation requires at least one of every character type.
    */
  var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.native
}

object GetRandomPasswordRequest {
  @scala.inline
  def apply(): GetRandomPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordRequest]
  }
  @scala.inline
  implicit class GetRandomPasswordRequestOps[Self <: GetRandomPasswordRequest] (val x: Self) extends AnyVal {
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
    def setExcludeCharacters(value: ExcludeCharactersType): Self = this.set("ExcludeCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeCharacters: Self = this.set("ExcludeCharacters", js.undefined)
    @scala.inline
    def setExcludeLowercase(value: ExcludeLowercaseType): Self = this.set("ExcludeLowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeLowercase: Self = this.set("ExcludeLowercase", js.undefined)
    @scala.inline
    def setExcludeNumbers(value: ExcludeNumbersType): Self = this.set("ExcludeNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeNumbers: Self = this.set("ExcludeNumbers", js.undefined)
    @scala.inline
    def setExcludePunctuation(value: ExcludePunctuationType): Self = this.set("ExcludePunctuation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludePunctuation: Self = this.set("ExcludePunctuation", js.undefined)
    @scala.inline
    def setExcludeUppercase(value: ExcludeUppercaseType): Self = this.set("ExcludeUppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeUppercase: Self = this.set("ExcludeUppercase", js.undefined)
    @scala.inline
    def setIncludeSpace(value: IncludeSpaceType): Self = this.set("IncludeSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSpace: Self = this.set("IncludeSpace", js.undefined)
    @scala.inline
    def setPasswordLength(value: PasswordLengthType): Self = this.set("PasswordLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordLength: Self = this.set("PasswordLength", js.undefined)
    @scala.inline
    def setRequireEachIncludedType(value: RequireEachIncludedTypeType): Self = this.set("RequireEachIncludedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireEachIncludedType: Self = this.set("RequireEachIncludedType", js.undefined)
  }
  
}

