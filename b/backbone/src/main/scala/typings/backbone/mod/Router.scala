package typings.backbone.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "Router")
@js.native
class Router () extends StObject {
  def this(options: RouterOptions) = this()
  
  /* private */ def _bindRoutes(): Unit = js.native
  
  /* private */ def _extractParameters(route: RegExp, fragment: String): js.Array[String] = js.native
  
  /* private */ def _routeToRegExp(route: String): RegExp = js.native
  
  def execute(callback: js.Function, args: js.Array[js.Any], name: String): Unit = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: RouterOptions): Unit = js.native
  
  def navigate(fragment: String): Router = js.native
  def navigate(fragment: String, options: NavigateOptions): Router = js.native
  def navigate(fragment: String, trigger: Boolean): Router = js.native
  
  /**
    * For use with Router as ES classes. If you define a preinitialize method,
    * it will be invoked when the Router is first created, before any
    * instantiation logic is run for the Router.
    * @see https://backbonejs.org/#Router-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(options: RouterOptions): Unit = js.native
  
  def route(route: String, name: String): Router = js.native
  def route(route: String, name: String, callback: js.Function): Router = js.native
  def route(route: RegExp, name: String): Router = js.native
  def route(route: RegExp, name: String, callback: js.Function): Router = js.native
  
  /**
    * Routes hash or a method returning the routes hash that maps URLs with parameters to methods on your Router.
    * For assigning routes as object hash, do it like this: this.routes = <any>{ "route": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  var routes: RoutesHash | js.Any = js.native
}
object Router {
  
  @JSImport("backbone", "Router")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  /* static member */
  @scala.inline
  def extend(properties: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def extend(properties: js.Any, classProperties: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
