package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRandomPasswordRequest extends StObject {
  
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
  implicit class GetRandomPasswordRequestMutableBuilder[Self <: GetRandomPasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeCharacters(value: ExcludeCharactersType): Self = StObject.set(x, "ExcludeCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeCharactersUndefined: Self = StObject.set(x, "ExcludeCharacters", js.undefined)
    
    @scala.inline
    def setExcludeLowercase(value: ExcludeLowercaseType): Self = StObject.set(x, "ExcludeLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeLowercaseUndefined: Self = StObject.set(x, "ExcludeLowercase", js.undefined)
    
    @scala.inline
    def setExcludeNumbers(value: ExcludeNumbersType): Self = StObject.set(x, "ExcludeNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNumbersUndefined: Self = StObject.set(x, "ExcludeNumbers", js.undefined)
    
    @scala.inline
    def setExcludePunctuation(value: ExcludePunctuationType): Self = StObject.set(x, "ExcludePunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePunctuationUndefined: Self = StObject.set(x, "ExcludePunctuation", js.undefined)
    
    @scala.inline
    def setExcludeUppercase(value: ExcludeUppercaseType): Self = StObject.set(x, "ExcludeUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUppercaseUndefined: Self = StObject.set(x, "ExcludeUppercase", js.undefined)
    
    @scala.inline
    def setIncludeSpace(value: IncludeSpaceType): Self = StObject.set(x, "IncludeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSpaceUndefined: Self = StObject.set(x, "IncludeSpace", js.undefined)
    
    @scala.inline
    def setPasswordLength(value: PasswordLengthType): Self = StObject.set(x, "PasswordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordLengthUndefined: Self = StObject.set(x, "PasswordLength", js.undefined)
    
    @scala.inline
    def setRequireEachIncludedType(value: RequireEachIncludedTypeType): Self = StObject.set(x, "RequireEachIncludedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireEachIncludedTypeUndefined: Self = StObject.set(x, "RequireEachIncludedType", js.undefined)
  }
}
