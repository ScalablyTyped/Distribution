package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.CommonJS
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeAwareCache[T] extends StObject {
  
  def delete(key: java.lang.String): this.type = js.native
  def delete(key: java.lang.String, mode: CommonJS): this.type = js.native
  def delete(key: java.lang.String, mode: ESNext): this.type = js.native
  
  def forEach(
    cb: js.Function3[
      /* elem */ T, 
      /* key */ java.lang.String, 
      /* mode */ js.UndefOr[CommonJS | ESNext], 
      Unit
    ]
  ): Unit = js.native
  
  def get(key: java.lang.String): js.UndefOr[T] = js.native
  def get(key: java.lang.String, mode: CommonJS): js.UndefOr[T] = js.native
  def get(key: java.lang.String, mode: ESNext): js.UndefOr[T] = js.native
  
  def has(key: java.lang.String): Boolean = js.native
  def has(key: java.lang.String, mode: CommonJS): Boolean = js.native
  def has(key: java.lang.String, mode: ESNext): Boolean = js.native
  
  def set(key: java.lang.String, mode: Unit, value: T): this.type = js.native
  def set(key: java.lang.String, mode: CommonJS, value: T): this.type = js.native
  def set(key: java.lang.String, mode: ESNext, value: T): this.type = js.native
  
  def size(): Double = js.native
}
