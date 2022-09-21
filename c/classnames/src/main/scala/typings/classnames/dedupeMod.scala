package typings.classnames

import typings.classnames.mod.ArgumentArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dedupeMod {
  
  /**
    * A simple JavaScript utility for conditionally joining classNames together.
    */
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type classNames.ArgumentArray is not an array type */ args: ArgumentArray
  ): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("classnames/dedupe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
