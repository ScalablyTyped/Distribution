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
  def apply(
    ExcludeCharacters: ExcludeCharactersType = null,
    ExcludeLowercase: js.UndefOr[Boolean] = js.undefined,
    ExcludeNumbers: js.UndefOr[Boolean] = js.undefined,
    ExcludePunctuation: js.UndefOr[Boolean] = js.undefined,
    ExcludeUppercase: js.UndefOr[Boolean] = js.undefined,
    IncludeSpace: js.UndefOr[Boolean] = js.undefined,
    PasswordLength: Int | Double = null,
    RequireEachIncludedType: js.UndefOr[Boolean] = js.undefined
  ): GetRandomPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (ExcludeCharacters != null) __obj.updateDynamic("ExcludeCharacters")(ExcludeCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(ExcludeLowercase)) __obj.updateDynamic("ExcludeLowercase")(ExcludeLowercase.asInstanceOf[js.Any])
    if (!js.isUndefined(ExcludeNumbers)) __obj.updateDynamic("ExcludeNumbers")(ExcludeNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(ExcludePunctuation)) __obj.updateDynamic("ExcludePunctuation")(ExcludePunctuation.asInstanceOf[js.Any])
    if (!js.isUndefined(ExcludeUppercase)) __obj.updateDynamic("ExcludeUppercase")(ExcludeUppercase.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeSpace)) __obj.updateDynamic("IncludeSpace")(IncludeSpace.asInstanceOf[js.Any])
    if (PasswordLength != null) __obj.updateDynamic("PasswordLength")(PasswordLength.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireEachIncludedType)) __obj.updateDynamic("RequireEachIncludedType")(RequireEachIncludedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRandomPasswordRequest]
  }
}

