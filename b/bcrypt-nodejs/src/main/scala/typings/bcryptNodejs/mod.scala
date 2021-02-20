package typings.bcryptNodejs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcrypt-nodejs", "compare")
  @js.native
  def compare(data: String, hash: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = js.native
  
  @JSImport("bcrypt-nodejs", "compareSync")
  @js.native
  def compareSync(data: String, hash: String): Boolean = js.native
  
  @JSImport("bcrypt-nodejs", "genSalt")
  @js.native
  def genSalt(rounds: Double, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = js.native
  
  @JSImport("bcrypt-nodejs", "genSaltSync")
  @js.native
  def genSaltSync(): String = js.native
  @JSImport("bcrypt-nodejs", "genSaltSync")
  @js.native
  def genSaltSync(rounds: Double): String = js.native
  
  @JSImport("bcrypt-nodejs", "getRounds")
  @js.native
  def getRounds(hash: String): Double = js.native
  
  @JSImport("bcrypt-nodejs", "hash")
  @js.native
  def hash(data: String, salt: String, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = js.native
  @JSImport("bcrypt-nodejs", "hash")
  @js.native
  def hash(
    data: String,
    salt: String,
    progressCallback: js.Function0[Unit],
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = js.native
  @JSImport("bcrypt-nodejs", "hash")
  @js.native
  def hash(
    data: String,
    salt: String,
    progressCallback: Null,
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = js.native
  
  @JSImport("bcrypt-nodejs", "hashSync")
  @js.native
  def hashSync(data: String): String = js.native
  @JSImport("bcrypt-nodejs", "hashSync")
  @js.native
  def hashSync(data: String, salt: String): String = js.native
}
