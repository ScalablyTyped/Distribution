package typings.datastoreLevel.mod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDatastoreOptions
  extends /* key */ StringDictionary[js.Any] {
  var db: js.UndefOr[
    js.Function2[
      /* location */ String, 
      /* options */ js.UndefOr[js.Any], 
      LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
    ]
  ] = js.native
}

object LevelDatastoreOptions {
  @scala.inline
  def apply(): LevelDatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDatastoreOptions]
  }
  @scala.inline
  implicit class LevelDatastoreOptionsOps[Self <: LevelDatastoreOptions] (val x: Self) extends AnyVal {
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
    def setDb(
      value: (/* location */ String, /* options */ js.UndefOr[js.Any]) => LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
    ): Self = this.set("db", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
  }
  
}

