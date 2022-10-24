package typings.blueprintjsSelect

import typings.blueprintjsCore.libEsmComponentsMenuMenuItemMod.MenuItemProps
import typings.blueprintjsSelect.`libEsm@ExamplesFilmSelectMod`.FilmSelectProps
import typings.blueprintjsSelect.`libEsm@ExamplesFilmsMod`.Film
import typings.blueprintjsSelect.anon.CreatedItems
import typings.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRenderer
import typings.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRendererProps
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemPredicate
import typings.react.mod.Attributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEventHandler
import typings.react.mod.global.JSX.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `libEsm@ExamplesMod` {
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FilmSelect(param0: FilmSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilmSelect")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples", "TOP_100_FILMS")
  @js.native
  val TOP_100_FILMS: js.Array[Film] = js.native
  
  inline def addFilmToArray(films: js.Array[Film], filmToAdd: Film): js.Array[Film] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFilmToArray")(films.asInstanceOf[js.Any], filmToAdd.asInstanceOf[js.Any])).asInstanceOf[js.Array[Film]]
  
  inline def areFilmsEqual(filmA: Film, filmB: Film): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areFilmsEqual")(filmA.asInstanceOf[js.Any], filmB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayContainsFilm(films: js.Array[Film], filmToFind: Film): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsFilm")(films.asInstanceOf[js.Any], filmToFind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createFilm(title: String): Film = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilm")(title.asInstanceOf[js.Any]).asInstanceOf[Film]
  
  inline def createFilms(query: String): js.Array[Film] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilms")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[Film]]
  
  inline def deleteFilmFromArray(films: js.Array[Film], filmToDelete: Film): js.Array[Film] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFilmFromArray")(films.asInstanceOf[js.Any], filmToDelete.asInstanceOf[js.Any])).asInstanceOf[js.Array[Film]]
  
  inline def doesFilmEqualQuery(film: Film, query: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesFilmEqualQuery")(film.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples", "filterFilm")
  @js.native
  val filterFilm: ItemPredicate[Film] = js.native
  
  inline def getFilmItemProps(film: Film, param1: ItemRendererProps): MenuItemProps & Attributes & HTMLAttributes[HTMLAnchorElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilmItemProps")(film.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[MenuItemProps & Attributes & HTMLAttributes[HTMLAnchorElement]]
  
  inline def maybeAddCreatedFilmToArrays(items: js.Array[Film], createdItems: js.Array[Film], film: Film): CreatedItems = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeAddCreatedFilmToArrays")(items.asInstanceOf[js.Any], createdItems.asInstanceOf[js.Any], film.asInstanceOf[js.Any])).asInstanceOf[CreatedItems]
  
  inline def maybeDeleteCreatedFilmFromArrays(items: js.Array[Film], createdItems: js.Array[Film], film: Film): CreatedItems = (^.asInstanceOf[js.Dynamic].applyDynamic("maybeDeleteCreatedFilmFromArrays")(items.asInstanceOf[js.Any], createdItems.asInstanceOf[js.Any], film.asInstanceOf[js.Any])).asInstanceOf[CreatedItems]
  
  inline def renderCreateFilmMenuItem(query: String, active: Boolean, handleClick: MouseEventHandler[HTMLElement]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCreateFilmMenuItem")(query.asInstanceOf[js.Any], active.asInstanceOf[js.Any], handleClick.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def renderCreateFilmsMenuItem(query: String, active: Boolean, handleClick: MouseEventHandler[HTMLElement]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCreateFilmsMenuItem")(query.asInstanceOf[js.Any], active.asInstanceOf[js.Any], handleClick.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples", "renderFilm")
  @js.native
  val renderFilm: ItemRenderer[Film] = js.native
}
