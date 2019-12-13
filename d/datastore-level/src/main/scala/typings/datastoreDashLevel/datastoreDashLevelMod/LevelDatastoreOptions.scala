package typings.datastoreDashLevel.datastoreDashLevelMod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractIterator
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractLevelDOWN
import typings.levelup.levelupMod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDatastoreOptions
  extends /* key */ StringDictionary[js.Any] {
  var db: js.UndefOr[
    js.Function2[
      /* location */ String, 
      /* options */ js.UndefOr[js.Any], 
      LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
    ]
  ] = js.undefined
}

object LevelDatastoreOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    db: (/* location */ String, /* options */ js.UndefOr[js.Any]) => LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]] = null
  ): LevelDatastoreOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (db != null) __obj.updateDynamic("db")(js.Any.fromFunction2(db))
    __obj.asInstanceOf[LevelDatastoreOptions]
  }
}

