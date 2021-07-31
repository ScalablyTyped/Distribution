package typings.bip39

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip39", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def entropyToMnemonic(entropy: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def entropyToMnemonic(entropy: String, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def entropyToMnemonic(entropy: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def entropyToMnemonic(entropy: Buffer, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("entropyToMnemonic")(entropy.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def generateMnemonic(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")().asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Double, rng: js.Function1[/* size */ Double, Buffer], wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Double, rng: Unit, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Unit, rng: js.Function1[/* size */ Double, Buffer]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Unit, rng: js.Function1[/* size */ Double, Buffer], wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def generateMnemonic(strength: Unit, rng: Unit, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMnemonic")(strength.asInstanceOf[js.Any], rng.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDefaultWordlist(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultWordlist")().asInstanceOf[String]
  
  @scala.inline
  def mnemonicToEntropy(mnemonic: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mnemonicToEntropy(mnemonic: String, wordlist: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToEntropy")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def mnemonicToSeed(mnemonic: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def mnemonicToSeed(mnemonic: String, password: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeed")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def mnemonicToSeedSync(mnemonic: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def mnemonicToSeedSync(mnemonic: String, password: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mnemonicToSeedSync")(mnemonic.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def setDefaultWordlist(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultWordlist")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def validateMnemonic(mnemonic: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMnemonic")(mnemonic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validateMnemonic(mnemonic: String, wordlist: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateMnemonic")(mnemonic.asInstanceOf[js.Any], wordlist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
