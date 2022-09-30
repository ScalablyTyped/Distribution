package typings.commander

import typings.commander.mod.AddHelpTextPosition
import typings.commander.mod.HookEvent
import typings.commander.mod.OptionValueSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commanderStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with OptionValueSource
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait after
    extends StObject
       with AddHelpTextPosition
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait afterAll
    extends StObject
       with AddHelpTextPosition
  inline def afterAll: afterAll = "afterAll".asInstanceOf[afterAll]
  
  @js.native
  sealed trait before
    extends StObject
       with AddHelpTextPosition
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait beforeAll
    extends StObject
       with AddHelpTextPosition
  inline def beforeAll: beforeAll = "beforeAll".asInstanceOf[beforeAll]
  
  @js.native
  sealed trait cli
    extends StObject
       with OptionValueSource
  inline def cli: cli = "cli".asInstanceOf[cli]
  
  @js.native
  sealed trait config
    extends StObject
       with OptionValueSource
  inline def config: config = "config".asInstanceOf[config]
  
  @js.native
  sealed trait electron extends StObject
  inline def electron: electron = "electron".asInstanceOf[electron]
  
  @js.native
  sealed trait env
    extends StObject
       with OptionValueSource
  inline def env: env = "env".asInstanceOf[env]
  
  @js.native
  sealed trait implied
    extends StObject
       with OptionValueSource
  inline def implied: implied = "implied".asInstanceOf[implied]
  
  @js.native
  sealed trait node extends StObject
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait postAction
    extends StObject
       with HookEvent
  inline def postAction: postAction = "postAction".asInstanceOf[postAction]
  
  @js.native
  sealed trait preAction
    extends StObject
       with HookEvent
  inline def preAction: preAction = "preAction".asInstanceOf[preAction]
  
  @js.native
  sealed trait preSubcommand
    extends StObject
       with HookEvent
  inline def preSubcommand: preSubcommand = "preSubcommand".asInstanceOf[preSubcommand]
  
  @js.native
  sealed trait user extends StObject
  inline def user: user = "user".asInstanceOf[user]
}
