package typings.cookieclicker

import typings.cookieclicker.Game.PseudoBoolean
import typings.cookieclicker.Game.PseudoNull
import typings.cookieclicker.anon.HTMLCanvasElementwidth8he
import typings.std.Event
import typings.std.HTMLImageElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loader extends js.Object {
  
  /**
    * Loads assets
    * @param assets The iterable of strings to get asset names from
    */
  def Load(assets: js.Array[String]): Unit = js.native
  
  /**
    * Replaces an asset if the original asset exists
    * @param old The name of the old asset
    * @param newer The name of the new asset, isn't prefixed by `this.prefix` if it has `http` in the name
    */
  def Replace(old: String, newer: String): Unit = js.native
  
  var assets: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, HTMLImageElement]) = js.native
  
  /**
    * Names of the assets that have been loaded
    */
  var assetsLoaded: js.Array[String] = js.native
  
  /**
    * Names of the assets that are currently loading
    */
  var assetsLoading: js.Array[String] = js.native
  
  /**
    * Total amount of assets, both loading and loaded
    */
  var assetsN: Double = js.native
  
  /**
    * An empty 8x8 canvas element, used in the `Pic` constructor
    */
  var blank: HTMLCanvasElementwidth8he = js.native
  
  /**
    * The prefix to all assets
    */
  var domain: String = js.native
  
  /**
    * A pseudoboolean, is true when all assets are loaded for the first time
    */
  var doneLoading: PseudoBoolean = js.native
  
  /**
    * Returns the progress of loading all assets
    */
  def getProgress(): Double = js.native
  
  /**
    * A callback to when all assets is loaded
    */
  var loaded: PseudoNull | js.Function0[Unit] = js.native
  
  /**
    * The amount of loading assets
    */
  var loadingN: Double = js.native
  
  /**
    * An internal callback function
    */
  def onLoad(e: Event): Unit = js.native
  
  /**
    * Unused @deprecated
    */
  def onLoadReplace(): Unit = js.native
}
object Loader {
  
  @scala.inline
  def apply(
    Load: js.Array[String] => Unit,
    Replace: (String, String) => Unit,
    assets: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, HTMLImageElement]),
    assetsLoaded: js.Array[String],
    assetsLoading: js.Array[String],
    assetsN: Double,
    blank: HTMLCanvasElementwidth8he,
    domain: String,
    doneLoading: PseudoBoolean,
    getProgress: () => Double,
    loaded: PseudoNull | js.Function0[Unit],
    loadingN: Double,
    onLoad: Event => Unit,
    onLoadReplace: () => Unit
  ): Loader = {
    val __obj = js.Dynamic.literal(Load = js.Any.fromFunction1(Load), Replace = js.Any.fromFunction2(Replace), assets = assets.asInstanceOf[js.Any], assetsLoaded = assetsLoaded.asInstanceOf[js.Any], assetsLoading = assetsLoading.asInstanceOf[js.Any], assetsN = assetsN.asInstanceOf[js.Any], blank = blank.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], doneLoading = doneLoading.asInstanceOf[js.Any], getProgress = js.Any.fromFunction0(getProgress), loaded = loaded.asInstanceOf[js.Any], loadingN = loadingN.asInstanceOf[js.Any], onLoad = js.Any.fromFunction1(onLoad), onLoadReplace = js.Any.fromFunction0(onLoadReplace))
    __obj.asInstanceOf[Loader]
  }
  
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoad(value: js.Array[String] => Unit): Self = this.set("Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplace(value: (String, String) => Unit): Self = this.set("Replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAssets(value: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, HTMLImageElement])): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsLoadedVarargs(value: String*): Self = this.set("assetsLoaded", js.Array(value :_*))
    
    @scala.inline
    def setAssetsLoaded(value: js.Array[String]): Self = this.set("assetsLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsLoadingVarargs(value: String*): Self = this.set("assetsLoading", js.Array(value :_*))
    
    @scala.inline
    def setAssetsLoading(value: js.Array[String]): Self = this.set("assetsLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsN(value: Double): Self = this.set("assetsN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlank(value: HTMLCanvasElementwidth8he): Self = this.set("blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneLoading(value: PseudoBoolean): Self = this.set("doneLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProgress(value: () => Double): Self = this.set("getProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadedFunction0(value: () => Unit): Self = this.set("loaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoaded(value: PseudoNull | js.Function0[Unit]): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingN(value: Double): Self = this.set("loadingN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoad(value: Event => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadReplace(value: () => Unit): Self = this.set("onLoadReplace", js.Any.fromFunction0(value))
  }
}
