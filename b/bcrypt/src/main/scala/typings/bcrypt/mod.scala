package typings.bcrypt

import typings.bcrypt.bcryptStrings.a
import typings.bcrypt.bcryptStrings.b
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(data: String, encrypted: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def compare(
    data: String,
    encrypted: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* same */ Boolean, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compare(data: Buffer, encrypted: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def compare(
    data: Buffer,
    encrypted: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* same */ Boolean, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compareSync(data: String, encrypted: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareSync(data: Buffer, encrypted: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSync")(data.asInstanceOf[js.Any], encrypted.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def genSalt(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")().asInstanceOf[js.Promise[String]]
  inline def genSalt(callback: js.Function2[/* err */ js.UndefOr[js.Error], /* salt */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def genSalt(rounds: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def genSalt(rounds: Double, callback: js.Function2[/* err */ js.UndefOr[js.Error], /* salt */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def genSalt(rounds: Double, minor: a | b): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def genSalt(
    rounds: Double,
    minor: a | b,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* salt */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def genSalt(rounds: Unit, minor: a | b): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genSalt")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def genSaltSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")().asInstanceOf[String]
  inline def genSaltSync(rounds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def genSaltSync(rounds: Double, minor: a | b): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def genSaltSync(rounds: Unit, minor: a | b): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genSaltSync")(rounds.asInstanceOf[js.Any], minor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRounds(encrypted: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRounds")(encrypted.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hash(data: String, saltOrRounds: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(
    data: String,
    saltOrRounds: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* encrypted */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(data: String, saltOrRounds: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(
    data: String,
    saltOrRounds: Double,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* encrypted */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(data: Buffer, saltOrRounds: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(
    data: Buffer,
    saltOrRounds: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* encrypted */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hash(data: Buffer, saltOrRounds: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def hash(
    data: Buffer,
    saltOrRounds: Double,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* encrypted */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hashSync(data: String, saltOrRounds: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hashSync(data: String, saltOrRounds: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hashSync(data: Buffer, saltOrRounds: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hashSync(data: Buffer, saltOrRounds: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashSync")(data.asInstanceOf[js.Any], saltOrRounds.asInstanceOf[js.Any])).asInstanceOf[String]
}
