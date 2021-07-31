package typings.bcryptNodejs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcrypt-nodejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compare(data: String, hash: String, callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def compareSync(data: String, hash: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(data.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def genSalt(rounds: Double, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def genSaltSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")().asInstanceOf[String]
  @scala.inline
  def genSaltSync(rounds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getRounds(hash: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRounds")(hash.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hash(data: String, salt: String, callback: js.Function2[/* error */ Error, /* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hash(
    data: String,
    salt: String,
    progressCallback: js.Function0[Unit],
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hash(
    data: String,
    salt: String,
    progressCallback: Null,
    callback: js.Function2[/* error */ Error, /* result */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def hashSync(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hashSync(data: String, salt: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[String]
}
