package typings.bcryptjs

import typings.bcryptjs.anon.ReadonlyArrayLikenumber
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcryptjs", "compare")
  @js.native
  def compare(s: String, hash: String): Unit = js.native
  @JSImport("bcryptjs", "compare")
  @js.native
  def compare(
    s: String,
    hash: String,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  @JSImport("bcryptjs", "compare")
  @js.native
  def compare(s: String, hash: String, callback: js.Function2[/* err */ Error, /* success */ Boolean, Unit]): Unit = js.native
  @JSImport("bcryptjs", "compare")
  @js.native
  def compare(
    s: String,
    hash: String,
    callback: js.Function2[/* err */ Error, /* success */ Boolean, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("bcryptjs", "compareSync")
  @js.native
  def compareSync(s: String, hash: String): Boolean = js.native
  
  @JSImport("bcryptjs", "compare")
  @js.native
  def compare_Promise(s: String, hash: String): js.Promise[Boolean] = js.native
  
  @JSImport("bcryptjs", "decodeBase64")
  @js.native
  def decodeBase64(s: String, len: Double): js.Array[Double] = js.native
  
  @JSImport("bcryptjs", "encodeBase64")
  @js.native
  def encodeBase64(b: ReadonlyArrayLikenumber, len: Double): String = js.native
  
  @JSImport("bcryptjs", "genSalt")
  @js.native
  def genSalt(): js.Promise[String] = js.native
  @JSImport("bcryptjs", "genSalt")
  @js.native
  def genSalt(callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): Unit = js.native
  @JSImport("bcryptjs", "genSalt")
  @js.native
  def genSalt(rounds: Double): js.Promise[String] = js.native
  @JSImport("bcryptjs", "genSalt")
  @js.native
  def genSalt(rounds: Double, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): Unit = js.native
  
  @JSImport("bcryptjs", "genSaltSync")
  @js.native
  def genSaltSync(): String = js.native
  @JSImport("bcryptjs", "genSaltSync")
  @js.native
  def genSaltSync(rounds: Double): String = js.native
  
  @JSImport("bcryptjs", "getRounds")
  @js.native
  def getRounds(hash: String): Double = js.native
  
  @JSImport("bcryptjs", "getSalt")
  @js.native
  def getSalt(hash: String): String = js.native
  
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(s: String, salt: String): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(
    s: String,
    salt: String,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(s: String, salt: String, callback: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(
    s: String,
    salt: String,
    callback: js.Function2[/* err */ Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(s: String, salt: Double): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(
    s: String,
    salt: Double,
    callback: js.UndefOr[scala.Nothing],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(s: String, salt: Double, callback: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash(
    s: String,
    salt: Double,
    callback: js.Function2[/* err */ Error, /* hash */ String, Unit],
    progressCallback: js.Function1[/* percent */ Double, Unit]
  ): Unit = js.native
  
  @JSImport("bcryptjs", "hashSync")
  @js.native
  def hashSync(s: String): String = js.native
  @JSImport("bcryptjs", "hashSync")
  @js.native
  def hashSync(s: String, salt: String): String = js.native
  @JSImport("bcryptjs", "hashSync")
  @js.native
  def hashSync(s: String, salt: Double): String = js.native
  
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash_Promise(s: String, salt: String): js.Promise[String] = js.native
  @JSImport("bcryptjs", "hash")
  @js.native
  def hash_Promise(s: String, salt: Double): js.Promise[String] = js.native
  
  @JSImport("bcryptjs", "setRandomFallback")
  @js.native
  def setRandomFallback(random: js.Function1[/* random */ Double, js.Array[Double]]): Unit = js.native
}
