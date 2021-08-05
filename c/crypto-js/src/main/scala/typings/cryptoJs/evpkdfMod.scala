package typings.cryptoJs

import typings.cryptoJs.anon.Hasher
import typings.cryptoJs.mod.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evpkdfMod {
  
  inline def apply(password: String, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: String, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: String): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: String, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: WordArray): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  inline def apply(password: WordArray, salt: WordArray, cfg: Hasher): WordArray = (^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[WordArray]
  
  @JSImport("crypto-js/evpkdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
