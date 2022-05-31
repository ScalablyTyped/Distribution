package typings.bunnymq

import typings.bunnymq.mod.Instance
import typings.bunnymq.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def bunnymq(): Instance = js.Dynamic.global.applyDynamic("bunnymq")().asInstanceOf[Instance]
  inline def bunnymq(options: Options): Instance = js.Dynamic.global.applyDynamic("bunnymq")(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
}
