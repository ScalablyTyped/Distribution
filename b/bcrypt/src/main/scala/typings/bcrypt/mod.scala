package typings.bcrypt

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compare(data: js.Any, encrypted: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def compare(data: js.Any, encrypted: String, callback: js.Function2[/* err */ Error, /* same */ Boolean, Unit]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def compareSync(data: js.Any, encrypted: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def genSalt(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")().asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Double, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Double, minor: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Double, minor: String, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Double, minor: Unit, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Unit, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Unit, minor: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Unit, minor: String, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def genSalt(rounds: Unit, minor: Unit, callback: js.Function2[/* err */ Error, /* salt */ String, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def genSaltSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")().asInstanceOf[String]
  @scala.inline
  def genSaltSync(rounds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def genSaltSync(rounds: Double, minor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def genSaltSync(rounds: Unit, minor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRounds(encrypted: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRounds")(encrypted.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hash(data: js.Any, saltOrRounds: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def hash(
    data: js.Any,
    saltOrRounds: String,
    callback: js.Function2[/* err */ Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def hash(data: js.Any, saltOrRounds: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def hash(
    data: js.Any,
    saltOrRounds: Double,
    callback: js.Function2[/* err */ Error, /* encrypted */ String, Unit]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def hashSync(data: js.Any, saltOrRounds: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def hashSync(data: js.Any, saltOrRounds: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
}
