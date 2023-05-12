package typings.chromeLauncher.anon

import typings.node.NodeJS.ErrnoException
import typings.node.anon.StatFsOptionsbigintfalseu
import typings.node.anon.StatFsOptionsbiginttrue
import typings.node.fsMod.BigIntStatsFs
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatFsOptions
import typings.node.fsMod.StatsFs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstatfs extends StObject {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ StatsFs, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, BigIntStatsFs | (/* stats */ StatsFs), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatFsOptionsbigintfalseu,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ StatsFs, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatFsOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStatsFs, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatFsOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ StatsFs | BigIntStatsFs, Unit]
  ): Unit = js.native
}
