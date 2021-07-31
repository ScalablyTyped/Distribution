package typings.cryptoJs

import typings.cryptoJs.mod.KDFOption
import typings.cryptoJs.mod.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @scala.inline
  def apply(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: String, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: String, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: WordArray, salt: String, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  @scala.inline
  def apply(password: WordArray, salt: WordArray, cfg: KDFOption): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  @JSImport("crypto-js/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
