package typings.backbone.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone", "Router")
@js.native
open class Router () extends StObject {
  def this(options: RouterOptions) = this()
  
  /* protected */ def _bindRoutes(): Unit = js.native
  
  /* protected */ def _extractParameters(route: js.RegExp, fragment: String): js.Array[String] = js.native
  
  /* protected */ def _routeToRegExp(route: String): js.RegExp = js.native
  
  def execute(callback: RouterCallback, args: js.Array[String], name: String): Unit = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: RouterOptions): Unit = js.native
  
  def navigate(fragment: String): this.type = js.native
  def navigate(fragment: String, options: Boolean): this.type = js.native
  def navigate(fragment: String, options: NavigateOptions): this.type = js.native
  
  /**
    * For use with Router as ES classes. If you define a preinitialize method,
    * it will be invoked when the Router is first created, before any
    * instantiation logic is run for the Router.
    * @see https://backbonejs.org/#Router-preinitialize
    */
  def preinitialize(): Unit = js.native
  def preinitialize(options: RouterOptions): Unit = js.native
  
  def route(route: String, callback: RouterCallback): this.type = js.native
  def route(route: String, name: String): this.type = js.native
  def route(route: String, name: String, callback: RouterCallback): this.type = js.native
  def route(route: js.RegExp, callback: RouterCallback): this.type = js.native
  def route(route: js.RegExp, name: String): this.type = js.native
  def route(route: js.RegExp, name: String, callback: RouterCallback): this.type = js.native
  
  /**
    * Routes hash or a method returning the routes hash that maps URLs with parameters to methods on your Router.
    * For assigning routes as object hash, do it like this: this.routes = <any>{ "route": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    */
  var routes: Result[RoutesHash] = js.native
}
object Router {
  
  @JSImport("backbone", "Router")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not use, prefer TypeScript's extend functionality.
    */
  /* static member */
  inline def extend(properties: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def extend(properties: Any, classProperties: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(properties.asInstanceOf[js.Any], classProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
}
