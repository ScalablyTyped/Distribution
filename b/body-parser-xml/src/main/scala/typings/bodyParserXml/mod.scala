package typings.bodyParserXml

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(bodyParser: js.Any): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(bodyParser.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  @JSImport("body-parser-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
